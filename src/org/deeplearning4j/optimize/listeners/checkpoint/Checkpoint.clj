(ns org.deeplearning4j.optimize.listeners.checkpoint.Checkpoint
  "A model checkpoint, used with CheckpointListener"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners.checkpoint Checkpoint]))

(defn ->checkpoint
  "Constructor."
  (^Checkpoint []
    (new Checkpoint )))

(defn *get-file-header
  "returns: `java.lang.String`"
  (^java.lang.String []
    (Checkpoint/getFileHeader )))

(defn *from-file-string
  "str - `java.lang.String`

  returns: `org.deeplearning4j.optimize.listeners.checkpoint.Checkpoint`"
  (^org.deeplearning4j.optimize.listeners.checkpoint.Checkpoint [^java.lang.String str]
    (Checkpoint/fromFileString str)))

(defn to-file-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Checkpoint this]
    (-> this (.toFileString))))

