(ns org.deeplearning4j.datasets.iterator.callbacks.FileCallback
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.callbacks FileCallback]))

(defn call
  "file - `java.io.File`

  returns: `<T> T`"
  ([^FileCallback this ^java.io.File file]
    (-> this (.call file))))

