(ns org.nd4j.aeron.ipc.LowLatencyMediaDriver
  "Created by agibsonccc on 9/22/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.ipc LowLatencyMediaDriver]))

(defn *main
  "args - `java.lang.String`"
  ([^java.lang.String args]
    (LowLatencyMediaDriver/main args)))

