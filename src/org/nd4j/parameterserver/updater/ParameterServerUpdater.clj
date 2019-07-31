(ns org.nd4j.parameterserver.updater.ParameterServerUpdater
  "A parameter server updater
 for applying updates on the parameter server"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.updater ParameterServerUpdater]))

(defn async?
  "Returns true if the
  given updater is async
  or synchronous
  updates

  returns: true if the given updater
  is async or synchronous updates - `boolean`"
  (^Boolean [^ParameterServerUpdater this]
    (-> this (.isAsync))))

(defn reset
  "Reset internal counters
  such as number of updates accumulated."
  ([^ParameterServerUpdater this]
    (-> this (.reset))))

(defn nd-array-holder
  "Get the ndarray holder for this
  updater

  returns: the ndarray holder for this updater - `org.nd4j.aeron.ipc.NDArrayHolder`"
  (^org.nd4j.aeron.ipc.NDArrayHolder [^ParameterServerUpdater this]
    (-> this (.ndArrayHolder))))

(defn update
  "Updates result
  based on arr

  arr - the array to update - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray to update - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ParameterServerUpdater this ^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.update arr result)))
  ([^ParameterServerUpdater this ^org.nd4j.aeron.ipc.NDArrayMessage message]
    (-> this (.update message))))

(defn partial-update
  "Updates result
  based on arr along a particular
  INDArray.tensorAlongDimension(int, int...)

  arr - the array to update - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray to update - `org.nd4j.linalg.api.ndarray.INDArray`
  idx - the index to update - `long`
  dimensions - the dimensions to update - `int`"
  ([^ParameterServerUpdater this ^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.api.ndarray.INDArray result ^Long idx ^Integer dimensions]
    (-> this (.partialUpdate arr result idx dimensions))))

(defn should-replicate?
  "Returns true if
  the updater has accumulated enough ndarrays to
  replicate to the workers

  returns: true if replication should happen,false otherwise - `boolean`"
  (^Boolean [^ParameterServerUpdater this]
    (-> this (.shouldReplicate))))

(defn status
  "Returns the current status of this parameter server
  updater

  returns: `java.util.Map<java.lang.String,java.lang.Number>`"
  (^java.util.Map [^ParameterServerUpdater this]
    (-> this (.status))))

(defn required-updates-for-pass
  "Returns the number of required
  updates for a new pass

  returns: the number of required updates for a new pass - `int`"
  (^Integer [^ParameterServerUpdater this]
    (-> this (.requiredUpdatesForPass))))

(defn to-json
  "Serialize this updater as json

  returns: `java.lang.String`"
  (^java.lang.String [^ParameterServerUpdater this]
    (-> this (.toJson))))

(defn num-updates
  "Num updates passed through
  the updater

  returns: the number of updates - `int`"
  (^Integer [^ParameterServerUpdater this]
    (-> this (.numUpdates))))

(defn ready?
  "Returns true if the updater is
  ready for a new array

  returns: `boolean`"
  (^Boolean [^ParameterServerUpdater this]
    (-> this (.isReady))))

