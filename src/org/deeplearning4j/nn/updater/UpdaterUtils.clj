(ns org.deeplearning4j.nn.updater.UpdaterUtils
  "Created by Alex on 14/04/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.updater UpdaterUtils]))

(defn ->updater-utils
  "Constructor."
  (^UpdaterUtils []
    (new UpdaterUtils )))

(defn *updater-configurations-equals
  "layer-1 - `org.deeplearning4j.nn.api.Trainable`
  param-1 - `java.lang.String`
  layer-2 - `org.deeplearning4j.nn.api.Trainable`
  param-2 - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^org.deeplearning4j.nn.api.Trainable layer-1 ^java.lang.String param-1 ^org.deeplearning4j.nn.api.Trainable layer-2 ^java.lang.String param-2]
    (UpdaterUtils/updaterConfigurationsEquals layer-1 param-1 layer-2 param-2)))

