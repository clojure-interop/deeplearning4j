(ns org.datavec.api.transform.transform.sequence.SequenceOffsetTransform$OperationType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.sequence SequenceOffsetTransform$OperationType]))

(def InPlace
  "Enum Constant.

  type: org.datavec.api.transform.transform.sequence.SequenceOffsetTransform$OperationType"
  SequenceOffsetTransform$OperationType/InPlace)

(def NewColumn
  "Enum Constant.

  type: org.datavec.api.transform.transform.sequence.SequenceOffsetTransform$OperationType"
  SequenceOffsetTransform$OperationType/NewColumn)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (SequenceOffsetTransform.OperationType c : SequenceOffsetTransform.OperationType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.transform.transform.sequence.SequenceOffsetTransform$OperationType[]`"
  ([]
    (SequenceOffsetTransform$OperationType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.transform.transform.sequence.SequenceOffsetTransform$OperationType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.transform.transform.sequence.SequenceOffsetTransform$OperationType [^java.lang.String name]
    (SequenceOffsetTransform$OperationType/valueOf name)))

