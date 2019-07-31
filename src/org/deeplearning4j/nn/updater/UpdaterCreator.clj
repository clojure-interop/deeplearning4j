(ns org.deeplearning4j.nn.updater.UpdaterCreator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.updater UpdaterCreator]))

(defn *get-updater
  "layer - `org.deeplearning4j.nn.api.Model`

  returns: `org.deeplearning4j.nn.api.Updater`"
  (^org.deeplearning4j.nn.api.Updater [^org.deeplearning4j.nn.api.Model layer]
    (UpdaterCreator/getUpdater layer)))

