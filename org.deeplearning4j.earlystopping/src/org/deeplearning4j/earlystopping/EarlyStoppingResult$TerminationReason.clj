(ns org.deeplearning4j.earlystopping.EarlyStoppingResult$TerminationReason
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping EarlyStoppingResult$TerminationReason]))

(def Error
  "Enum Constant.

  type: org.deeplearning4j.earlystopping.EarlyStoppingResult$TerminationReason"
  EarlyStoppingResult$TerminationReason/Error)

(def IterationTerminationCondition
  "Enum Constant.

  type: org.deeplearning4j.earlystopping.EarlyStoppingResult$TerminationReason"
  EarlyStoppingResult$TerminationReason/IterationTerminationCondition)

(def EpochTerminationCondition
  "Enum Constant.

  type: org.deeplearning4j.earlystopping.EarlyStoppingResult$TerminationReason"
  EarlyStoppingResult$TerminationReason/EpochTerminationCondition)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (EarlyStoppingResult.TerminationReason c : EarlyStoppingResult.TerminationReason.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.earlystopping.EarlyStoppingResult$TerminationReason[]`"
  ([]
    (EarlyStoppingResult$TerminationReason/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.earlystopping.EarlyStoppingResult$TerminationReason`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.earlystopping.EarlyStoppingResult$TerminationReason [^java.lang.String name]
    (EarlyStoppingResult$TerminationReason/valueOf name)))

