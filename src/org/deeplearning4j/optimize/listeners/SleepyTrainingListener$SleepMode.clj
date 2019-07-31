(ns org.deeplearning4j.optimize.listeners.SleepyTrainingListener$SleepMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners SleepyTrainingListener$SleepMode]))

(def PARK
  "Enum Constant.

  In this mode parkNanos() call will be used, to make process really idle

  type: org.deeplearning4j.optimize.listeners.SleepyTrainingListener$SleepMode"
  SleepyTrainingListener$SleepMode/PARK)

(def SLEEP
  "Enum Constant.

  In this mode Thread.sleep() call will be used, to make sleep traceable via profiler

  type: org.deeplearning4j.optimize.listeners.SleepyTrainingListener$SleepMode"
  SleepyTrainingListener$SleepMode/SLEEP)

(def BUSY
  "Enum Constant.

  Busy-lock will be used, to guarantee 100% thread use

  type: org.deeplearning4j.optimize.listeners.SleepyTrainingListener$SleepMode"
  SleepyTrainingListener$SleepMode/BUSY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (SleepyTrainingListener.SleepMode c : SleepyTrainingListener.SleepMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.optimize.listeners.SleepyTrainingListener$SleepMode[]`"
  ([]
    (SleepyTrainingListener$SleepMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.optimize.listeners.SleepyTrainingListener$SleepMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.optimize.listeners.SleepyTrainingListener$SleepMode [^java.lang.String name]
    (SleepyTrainingListener$SleepMode/valueOf name)))

