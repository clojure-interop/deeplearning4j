(ns org.nd4j.parameterserver.updater.storage.InMemoryUpdateStorage
  "An in memory storage mechanism backed
 by a thread safe CopyOnWriteArrayList"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.updater.storage InMemoryUpdateStorage]))

(defn ->in-memory-update-storage
  "Constructor."
  (^InMemoryUpdateStorage []
    (new InMemoryUpdateStorage )))

(defn add-update
  "Add an ndarray to the storage

  array - the array to add - `org.nd4j.aeron.ipc.NDArrayMessage`"
  ([^InMemoryUpdateStorage this ^org.nd4j.aeron.ipc.NDArrayMessage array]
    (-> this (.addUpdate array))))

(defn num-updates
  "The number of updates added
  to the update storage

  returns: `int`"
  (^Integer [^InMemoryUpdateStorage this]
    (-> this (.numUpdates))))

(defn clear
  "Clear the array storage"
  ([^InMemoryUpdateStorage this]
    (-> this (.clear))))

(defn do-get-update
  "A method for actually performing the implementation
  of retrieving the ndarray

  index - the index of the INDArray to get - `int`

  returns: the ndarray at the specified index - `org.nd4j.aeron.ipc.NDArrayMessage`"
  (^org.nd4j.aeron.ipc.NDArrayMessage [^InMemoryUpdateStorage this ^Integer index]
    (-> this (.doGetUpdate index))))

