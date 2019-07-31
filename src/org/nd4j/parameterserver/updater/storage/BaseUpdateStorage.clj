(ns org.nd4j.parameterserver.updater.storage.BaseUpdateStorage
  "Base class for common logic in update storage"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.updater.storage BaseUpdateStorage]))

(defn ->base-update-storage
  "Constructor."
  (^BaseUpdateStorage []
    (new BaseUpdateStorage )))

(defn get-update
  "Get the update at the specified index

  index - the update to get - `int`

  returns: the update at the specified index - `org.nd4j.aeron.ipc.NDArrayMessage`"
  (^org.nd4j.aeron.ipc.NDArrayMessage [^BaseUpdateStorage this ^Integer index]
    (-> this (.getUpdate index))))

(defn do-get-update
  "A method for actually performing the implementation
  of retrieving the ndarray

  index - the index of the INDArray to get - `int`

  returns: the ndarray at the specified index - `org.nd4j.aeron.ipc.NDArrayMessage`"
  (^org.nd4j.aeron.ipc.NDArrayMessage [^BaseUpdateStorage this ^Integer index]
    (-> this (.doGetUpdate index))))

(defn close
  "Close the database"
  ([^BaseUpdateStorage this]
    (-> this (.close))))

