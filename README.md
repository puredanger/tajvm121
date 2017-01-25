# tajvm121

Repro for http://dev.clojure.org/jira/browse/TANAL-121

```
lein repl
(require '[clojure.tools.analyzer.jvm :as anj])
(anj/analyze-ns 'tajvm121.core)

ExceptionInfo No such namespace: StandardWatchEventKinds  clojure.core/ex-info (core.clj:4725)
```

