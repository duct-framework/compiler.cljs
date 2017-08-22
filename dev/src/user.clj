(ns user
  (:require [integrant.core :as ig]
            [duct.core :as duct]
            [duct.compiler.cljs :as cljs]))

(duct/load-hierarchy)

(def config
  {:duct.compiler/cljs
   {:builds [{:source-paths ["dev/src/cljs/user.cljs"]
              :build-options {:output-to "dev/target/js/main.js"
                              :output-dir "dev/target/js"
                              :optimizations :whitespace}}]}})

(defn init []
  (ig/init config))
