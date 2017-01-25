(ns tajvm121.core
  (:require [clojure.core.async :as async :refer [go go-loop >! <!]]
            [clojure.java.io :as jio]
            [clojure.spec :as s])
  (:import [java.io File]
           [java.nio.file Files FileSystems FileVisitResult Path
                          SimpleFileVisitor StandardWatchEventKinds
                          WatchKey WatchEvent WatchService]))

(def ^:private event->kind
  {:create StandardWatchEventKinds/ENTRY_CREATE
   :modify StandardWatchEventKinds/ENTRY_MODIFY
   :delete StandardWatchEventKinds/ENTRY_DELETE})
