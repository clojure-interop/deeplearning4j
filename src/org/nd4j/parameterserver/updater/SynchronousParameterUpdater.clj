(ns org.nd4j.parameterserver.updater.SynchronousParameterUpdater
  "Adds the 2 arrays together,
 synchronizing when
 all updates have been collected."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.updater SynchronousParameterUpdater]))

(defn ->synchronous-parameter-updater
  "Constructor.

  Initialize this updater
  with a custom update storage

  update-storage - the update storage to use - `org.nd4j.parameterserver.updater.storage.UpdateStorage`
  workers - `int`"
  (^SynchronousParameterUpdater [^org.nd4j.parameterserver.updater.storage.UpdateStorage update-storage ^Integer workers]
    (new SynchronousParameterUpdater update-storage workers))
  (^SynchronousParameterUpdater [^Integer workers]
    (new SynchronousParameterUpdater workers))
  (^SynchronousParameterUpdater [^org.nd4j.parameterserver.updater.storage.UpdateStorage update-storage ^org.nd4j.aeron.ipc.NDArrayHolder nd-array-holder ^Integer workers]
    (new SynchronousParameterUpdater update-storage nd-array-holder workers)))

(defn required-updates-for-pass
  "Returns the number of required
  updates for a new pass

  returns: the number of required updates for a new pass - `int`"
  (^Integer [^SynchronousParameterUpdater this]
    (-> this (.requiredUpdatesForPass))))

(defn async?
  "Returns true if the
  given updater is async
  or synchronous
  updates

  returns: true if the given updater
  is async or synchronous updates - `boolean`"
  (^Boolean [^SynchronousParameterUpdater this]
    (-> this (.isAsync))))

(defn status
  "Returns the current status of this parameter server
  updater

  returns: `java.util.Map<java.lang.String,java.lang.Number>`"
  (^java.util.Map [^SynchronousParameterUpdater this]
    (-> this (.status))))

(defn to-json
  "Serialize this updater as json

  returns: `java.lang.String`"
  (^java.lang.String [^SynchronousParameterUpdater this]
    (-> this (.toJson))))

(defn should-replicate?
  "Returns true if
  the updater has accumulated enough ndarrays to
  replicate to the workers

  returns: true if replication should happen,false otherwise - `boolean`"
  (^Boolean [^SynchronousParameterUpdater this]
    (-> this (.shouldReplicate))))

(defn update
  "Updates result
  based on arr

  arr - the array to update - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray to update - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SynchronousParameterUpdater this ^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.update arr result)))
  ([^SynchronousParameterUpdater this ^org.nd4j.aeron.ipc.NDArrayMessage message]
    (-> this (.update message))))

(defn partial-update
  "Updates result
  based on arr along a particular
  INDArray.tensorAlongDimension(int, int...)

  arr - the array to update - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray to update - `org.nd4j.linalg.api.ndarray.INDArray`
  idx - the index to update - `long`
  dimensions - the dimensions to update - `int`"
  ([^SynchronousParameterUpdater this ^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.api.ndarray.INDArray result ^Long idx ^Integer dimensions]
    (-> this (.partialUpdate arr result idx dimensions))))

