(ns org.nd4j.parameterserver.updater.storage.NoUpdateStorage
  "Update storage that only stores update counts"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.updater.storage NoUpdateStorage]))

(defn ->no-update-storage
  "Constructor."
  (^NoUpdateStorage []
    (new NoUpdateStorage )))

(defn add-update
  "Add an ndarray to the storage

  array - the array to add - `org.nd4j.aeron.ipc.NDArrayMessage`"
  ([^NoUpdateStorage this ^org.nd4j.aeron.ipc.NDArrayMessage array]
    (-> this (.addUpdate array))))

(defn num-updates
  "The number of updates added
  to the update storage

  returns: `int`"
  (^Integer [^NoUpdateStorage this]
    (-> this (.numUpdates))))

(defn clear
  "Clear the array storage"
  ([^NoUpdateStorage this]
    (-> this (.clear))))

(defn do-get-update
  "A method for actually performing the implementation
  of retrieving the ndarray

  index - the index of the INDArray to get - `int`

  returns: the ndarray at the specified index - `org.nd4j.aeron.ipc.NDArrayMessage`"
  (^org.nd4j.aeron.ipc.NDArrayMessage [^NoUpdateStorage this ^Integer index]
    (-> this (.doGetUpdate index))))

