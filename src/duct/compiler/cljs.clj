(ns duct.compiler.cljs
  "Integrant methods to compile ClojureScript."
  (:require [cljs.build.api :as cljs]
            [integrant.core :as ig]))

(defn- build-cljs [{:keys [source-paths build-options]}]
  (cljs/build (apply cljs/inputs source-paths) build-options)
  (:output-to build-options))

(defmethod ig/init-key :duct.compiler/cljs [_ {:keys [builds]}]
  (mapv build-cljs builds))
