(ns org.nd4j.parameterserver.updater.SoftSyncParameterUpdater
  "Created by agibsonccc on 12/1/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.updater SoftSyncParameterUpdater]))

(defn ->soft-sync-parameter-updater
  "Constructor."
  (^SoftSyncParameterUpdater []
    (new SoftSyncParameterUpdater )))

(defn required-updates-for-pass
  "Returns the number of required
  updates for a new pass

  returns: the number of required updates for a new pass - `int`"
  (^Integer [^SoftSyncParameterUpdater this]
    (-> this (.requiredUpdatesForPass))))

(defn status
  "Returns the current status of this parameter server
  updater

  returns: `java.util.Map<java.lang.String,java.lang.Number>`"
  (^java.util.Map [^SoftSyncParameterUpdater this]
    (-> this (.status))))

(defn to-json
  "Serialize this updater as json

  returns: `java.lang.String`"
  (^java.lang.String [^SoftSyncParameterUpdater this]
    (-> this (.toJson))))

(defn reset
  "Reset internal counters
  such as number of updates accumulated."
  ([^SoftSyncParameterUpdater this]
    (-> this (.reset))))

(defn should-replicate?
  "Returns true if
  the updater has accumulated enough ndarrays to
  replicate to the workers

  returns: true if replication should happen,false otherwise - `boolean`"
  (^Boolean [^SoftSyncParameterUpdater this]
    (-> this (.shouldReplicate))))

(defn update
  "Updates result
  based on arr

  arr - the array to update - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray to update - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SoftSyncParameterUpdater this ^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.update arr result)))
  ([^SoftSyncParameterUpdater this ^org.nd4j.aeron.ipc.NDArrayMessage message]
    (-> this (.update message))))

(defn partial-update
  "Updates result
  based on arr along a particular
  INDArray.tensorAlongDimension(int, int...)

  arr - the array to update - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray to update - `org.nd4j.linalg.api.ndarray.INDArray`
  idx - the index to update - `long`
  dimensions - the dimensions to update - `int`"
  ([^SoftSyncParameterUpdater this ^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.api.ndarray.INDArray result ^Long idx ^Integer dimensions]
    (-> this (.partialUpdate arr result idx dimensions))))

