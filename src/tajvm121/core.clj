(ns tajvm121.core
  (:require [clojure.core.async :as async :refer [go go-loop >! <!]])
  (:import [java.nio.file StandardWatchEventKinds]))

(def ^:private event->kind
  {:create StandardWatchEventKinds/ENTRY_CREATE
   :modify StandardWatchEventKinds/ENTRY_MODIFY
   :delete StandardWatchEventKinds/ENTRY_DELETE})
