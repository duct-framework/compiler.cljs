(defproject duct/compiler.cljs "0.2.0"
  :description "Integrant methods for compiling ClojureScript"
  :url "https://github.com/duct-framework/compiler.cljs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [duct/core "0.7.0-beta1"]
                 [integrant "0.7.0"]]
  :profiles
  {:provided {:dependencies [[org.clojure/clojurescript "1.10.339"]]}
   :dev      {:source-paths ["dev/src"]}})
