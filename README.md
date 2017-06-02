# Duct compiler.cljs

[Integrant][] methods for compiling ClojureScript files in the
[Duct][] framework. This compiler is typically invoked before
compiling an uberjar for production release. For working with
ClojureScript during development, use [server.figwheel][].

[integrant]:       https://github.com/weavejester/integrant
[duct]:            https://github.com/duct-framework/duct
[server.figwheel]: https://github.com/duct-framework/server.figwheel

## Installation

To install, add the following to your project `:dependencies`:

    [duct/compiler.cljs "0.1.2"]

## Usage

This library provides the `:duct.compiler/cljs` key, and works much
the same way as [lein-cljsbuild][].

```edn
{:duct.compiler/cljs
 {:builds [{:source-paths  ["src"]
            :build-options {:output-to "target/js/main.js"
                            :output-dir "target/js"
                            :optimizations :whitespace}}]}}
```

The `:build-options` available are covered in the ClojureScript wiki
page on [compiler options][].

[lein-cljsbuild]:   https://github.com/emezeske/lein-cljsbuild
[compiler options]: https://github.com/clojure/clojurescript/wiki/Compiler-Options

## License

Copyright © 2017 James Reeves

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
