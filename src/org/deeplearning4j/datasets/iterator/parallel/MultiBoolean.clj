(ns org.deeplearning4j.datasets.iterator.parallel.MultiBoolean
  "This is utility class, that allows easy handling of multiple joint boolean states.
 PLEASE NOTE: It's suited for tracking up to 32 states in total.
 PLEASE NOTE: This class is NOT thread safe"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.parallel MultiBoolean]))

(defn ->multi-boolean
  "Constructor.

  num-entries - `int`
  initial-value - `boolean`
  one-time - `boolean`"
  (^MultiBoolean [^Integer num-entries ^Boolean initial-value ^Boolean one-time]
    (new MultiBoolean num-entries initial-value one-time))
  (^MultiBoolean [^Integer num-entries ^Boolean initial-value]
    (new MultiBoolean num-entries initial-value))
  (^MultiBoolean [^Integer num-entries]
    (new MultiBoolean num-entries)))

(defn set
  "Sets specified entry to specified state

  value - `boolean`
  entry - `int`"
  ([^MultiBoolean this ^Boolean value ^Integer entry]
    (-> this (.set value entry))))

(defn get
  "Gets current state for specified entry

  entry - `int`

  returns: `boolean`"
  (^Boolean [^MultiBoolean this ^Integer entry]
    (-> this (.get entry))))

(defn all-true
  "This method returns true if ALL states are true. False otherwise.

  returns: `boolean`"
  (^Boolean [^MultiBoolean this]
    (-> this (.allTrue))))

(defn all-false
  "This method returns true if ALL states are false. False otherwise

  returns: `boolean`"
  (^Boolean [^MultiBoolean this]
    (-> this (.allFalse))))

