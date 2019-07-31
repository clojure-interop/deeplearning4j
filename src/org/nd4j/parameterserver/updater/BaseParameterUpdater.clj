(ns org.nd4j.parameterserver.updater.BaseParameterUpdater
  "Base class for the parameter updater
 handling things such as update storage
 and basic operations like reset and number of updates"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.updater BaseParameterUpdater]))

(defn ->base-parameter-updater
  "Constructor.

  Initialize this updater
  with a custom update storage

  update-storage - the update storage to use - `org.nd4j.parameterserver.updater.storage.UpdateStorage`"
  (^BaseParameterUpdater [^org.nd4j.parameterserver.updater.storage.UpdateStorage update-storage]
    (new BaseParameterUpdater update-storage))
  (^BaseParameterUpdater []
    (new BaseParameterUpdater ))
  (^BaseParameterUpdater [^org.nd4j.parameterserver.updater.storage.UpdateStorage update-storage ^org.nd4j.aeron.ipc.NDArrayHolder nd-array-holder]
    (new BaseParameterUpdater update-storage nd-array-holder)))

(defn ready?
  "Returns true if the updater is
  ready for a new array

  returns: `boolean`"
  (^Boolean [^BaseParameterUpdater this]
    (-> this (.isReady))))

(defn async?
  "Returns true if the
  given updater is async
  or synchronous
  updates

  returns: true if the given updater
  is async or synchronous updates - `boolean`"
  (^Boolean [^BaseParameterUpdater this]
    (-> this (.isAsync))))

(defn nd-array-holder
  "Get the ndarray holder for this
  updater

  returns: the ndarray holder for this updater - `org.nd4j.aeron.ipc.NDArrayHolder`"
  (^org.nd4j.aeron.ipc.NDArrayHolder [^BaseParameterUpdater this]
    (-> this (.ndArrayHolder))))

(defn reset
  "Reset internal counters
  such as number of updates accumulated."
  ([^BaseParameterUpdater this]
    (-> this (.reset))))

(defn num-updates
  "Num updates passed through
  the updater

  returns: the number of updates - `int`"
  (^Integer [^BaseParameterUpdater this]
    (-> this (.numUpdates))))

