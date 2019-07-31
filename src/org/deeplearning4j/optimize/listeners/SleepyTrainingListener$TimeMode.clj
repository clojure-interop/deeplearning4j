(ns org.deeplearning4j.optimize.listeners.SleepyTrainingListener$TimeMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners SleepyTrainingListener$TimeMode]))

(def ADDITIVE
  "Enum Constant.

  In this mode, listener will be trying to match specified time for a given invocation method.
  I.e. if iteration sleep is set to 500, and real iteration was 35 ms, thread will be sleeping for 465ms, to match target time of 500ms

  type: org.deeplearning4j.optimize.listeners.SleepyTrainingListener$TimeMode"
  SleepyTrainingListener$TimeMode/ADDITIVE)

(def SIMPLE
  "Enum Constant.

  In this mode, listener will just call

  type: org.deeplearning4j.optimize.listeners.SleepyTrainingListener$TimeMode"
  SleepyTrainingListener$TimeMode/SIMPLE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (SleepyTrainingListener.TimeMode c : SleepyTrainingListener.TimeMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.optimize.listeners.SleepyTrainingListener$TimeMode[]`"
  ([]
    (SleepyTrainingListener$TimeMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.optimize.listeners.SleepyTrainingListener$TimeMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.optimize.listeners.SleepyTrainingListener$TimeMode [^java.lang.String name]
    (SleepyTrainingListener$TimeMode/valueOf name)))

