(ns org.nd4j.parameterserver.updater.storage.UpdateStorage
  "An interface for storing parameter server updates.
 This is used by an ParameterServerUpdater
 to handle storage of ndarrays"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.updater.storage UpdateStorage]))

(defn add-update
  "Add an ndarray to the storage

  array - the array to add - `org.nd4j.aeron.ipc.NDArrayMessage`"
  ([^UpdateStorage this ^org.nd4j.aeron.ipc.NDArrayMessage array]
    (-> this (.addUpdate array))))

(defn num-updates
  "The number of updates added
  to the update storage

  returns: `int`"
  (^Integer [^UpdateStorage this]
    (-> this (.numUpdates))))

(defn clear
  "Clear the array storage"
  ([^UpdateStorage this]
    (-> this (.clear))))

(defn get-update
  "Get the update at the specified index

  index - the update to get - `int`

  returns: the update at the specified index - `org.nd4j.aeron.ipc.NDArrayMessage`"
  (^org.nd4j.aeron.ipc.NDArrayMessage [^UpdateStorage this ^Integer index]
    (-> this (.getUpdate index))))

(defn close
  "Close the database"
  ([^UpdateStorage this]
    (-> this (.close))))

