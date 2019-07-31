(ns org.nd4j.linalg.util.AtomicThrowable
  "This class provides thread-safe holder for Throwable"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util AtomicThrowable]))

(defn ->atomic-throwable
  "Constructor.

  This method creates new instance with given initial state

  e - `java.lang.Exception`"
  (^AtomicThrowable [^java.lang.Exception e]
    (new AtomicThrowable e))
  (^AtomicThrowable []
    (new AtomicThrowable )))

(defn get
  "This method returns current state

  returns: `java.lang.Throwable`"
  (^java.lang.Throwable [^AtomicThrowable this]
    (-> this (.get))))

(defn set
  "This method updates state with given Throwable

  t - `java.lang.Throwable`"
  ([^AtomicThrowable this ^java.lang.Throwable t]
    (-> this (.set t))))

(defn set-if-first
  "This method updates state only if it wasn't set before

  t - `java.lang.Throwable`"
  ([^AtomicThrowable this ^java.lang.Throwable t]
    (-> this (.setIfFirst t))))

(defn triggered?
  "This method returns TRUE if internal state holds error, FALSE otherwise

  returns: `boolean`"
  (^Boolean [^AtomicThrowable this]
    (-> this (.isTriggered))))

