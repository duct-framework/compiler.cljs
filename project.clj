(defproject duct/compiler.cljs "0.1.0-SNAPSHOT"
  :description "Integrant methods for compiling ClojureScript"
  :url "https://github.com/duct-framework/compiler.cljs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [integrant "0.3.3"]]
  :profiles
  {:provided {:dependencies [[org.clojure/clojurescript "1.9.521"]]}
   :dev      {:source-paths ["dev/src"]}})
