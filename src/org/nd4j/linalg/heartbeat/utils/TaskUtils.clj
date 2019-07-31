(ns org.nd4j.linalg.heartbeat.utils.TaskUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.heartbeat.utils TaskUtils]))

(defn *build-task
  "array - `org.nd4j.linalg.api.ndarray.INDArray[]`
  labels - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: `org.nd4j.linalg.heartbeat.reports.Task`"
  (^org.nd4j.linalg.heartbeat.reports.Task [array labels]
    (TaskUtils/buildTask array labels))
  (^org.nd4j.linalg.heartbeat.reports.Task [^org.nd4j.linalg.api.ndarray.INDArray array]
    (TaskUtils/buildTask array)))

