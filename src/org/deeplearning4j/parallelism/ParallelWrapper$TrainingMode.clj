(ns org.deeplearning4j.parallelism.ParallelWrapper$TrainingMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism ParallelWrapper$TrainingMode]))

(def AVERAGING
  "Enum Constant.

  Averaging every X epochs will be applied

  type: org.deeplearning4j.parallelism.ParallelWrapper$TrainingMode"
  ParallelWrapper$TrainingMode/AVERAGING)

(def SHARED_GRADIENTS
  "Enum Constant.

  Models within ParallelWrapper instance will share gradients updates

  type: org.deeplearning4j.parallelism.ParallelWrapper$TrainingMode"
  ParallelWrapper$TrainingMode/SHARED_GRADIENTS)

(def CUSTOM
  "Enum Constant.

  This option assumes use of GradientsAccumulator with any MessageHandler

  type: org.deeplearning4j.parallelism.ParallelWrapper$TrainingMode"
  ParallelWrapper$TrainingMode/CUSTOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ParallelWrapper.TrainingMode c : ParallelWrapper.TrainingMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.parallelism.ParallelWrapper$TrainingMode[]`"
  ([]
    (ParallelWrapper$TrainingMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.parallelism.ParallelWrapper$TrainingMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.parallelism.ParallelWrapper$TrainingMode [^java.lang.String name]
    (ParallelWrapper$TrainingMode/valueOf name)))

