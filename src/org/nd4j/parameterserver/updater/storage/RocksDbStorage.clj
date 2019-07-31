(ns org.nd4j.parameterserver.updater.storage.RocksDbStorage
  "Created by agibsonccc on 12/2/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.updater.storage RocksDbStorage]))

(defn ->rocks-db-storage
  "Constructor.

  db-path - `java.lang.String`"
  (^RocksDbStorage [^java.lang.String db-path]
    (new RocksDbStorage db-path)))

(defn add-update
  "Add an ndarray to the storage

  array - the array to add - `org.nd4j.aeron.ipc.NDArrayMessage`"
  ([^RocksDbStorage this ^org.nd4j.aeron.ipc.NDArrayMessage array]
    (-> this (.addUpdate array))))

(defn num-updates
  "The number of updates added
  to the update storage

  returns: `int`"
  (^Integer [^RocksDbStorage this]
    (-> this (.numUpdates))))

(defn clear
  "Clear the array storage"
  ([^RocksDbStorage this]
    (-> this (.clear))))

(defn do-get-update
  "A method for actually performing the implementation
  of retrieving the ndarray

  index - the index of the INDArray to get - `int`

  returns: the ndarray at the specified index - `org.nd4j.aeron.ipc.NDArrayMessage`"
  (^org.nd4j.aeron.ipc.NDArrayMessage [^RocksDbStorage this ^Integer index]
    (-> this (.doGetUpdate index))))

(defn close
  "Close the database"
  ([^RocksDbStorage this]
    (-> this (.close))))

