(ns org.nd4j.linalg.primitives.SynchronizedObject
  "This class is simple holder for provided variable which can be accessed & updated in thread-safe way"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives SynchronizedObject]))

(defn ->synchronized-object
  "Constructor.

  value - `T`"
  (^SynchronizedObject [value]
    (new SynchronizedObject value))
  (^SynchronizedObject []
    (new SynchronizedObject )))

(defn get
  "This method returns stored value via read lock

  returns: `T`"
  ([^SynchronizedObject this]
    (-> this (.get))))

(defn set
  "This method updates stored value via write lock

  value - `T`"
  ([^SynchronizedObject this value]
    (-> this (.set value))))

