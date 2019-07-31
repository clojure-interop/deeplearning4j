(ns org.deeplearning4j.datasets.datavec.SequenceRecordReaderDataSetIterator$AlignmentMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.datavec SequenceRecordReaderDataSetIterator$AlignmentMode]))

(def EQUAL_LENGTH
  "Enum Constant.

  type: org.deeplearning4j.datasets.datavec.SequenceRecordReaderDataSetIterator$AlignmentMode"
  SequenceRecordReaderDataSetIterator$AlignmentMode/EQUAL_LENGTH)

(def ALIGN_START
  "Enum Constant.

  type: org.deeplearning4j.datasets.datavec.SequenceRecordReaderDataSetIterator$AlignmentMode"
  SequenceRecordReaderDataSetIterator$AlignmentMode/ALIGN_START)

(def ALIGN_END
  "Enum Constant.

  type: org.deeplearning4j.datasets.datavec.SequenceRecordReaderDataSetIterator$AlignmentMode"
  SequenceRecordReaderDataSetIterator$AlignmentMode/ALIGN_END)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (SequenceRecordReaderDataSetIterator.AlignmentMode c : SequenceRecordReaderDataSetIterator.AlignmentMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.datasets.datavec.SequenceRecordReaderDataSetIterator$AlignmentMode[]`"
  ([]
    (SequenceRecordReaderDataSetIterator$AlignmentMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.datasets.datavec.SequenceRecordReaderDataSetIterator$AlignmentMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.datasets.datavec.SequenceRecordReaderDataSetIterator$AlignmentMode [^java.lang.String name]
    (SequenceRecordReaderDataSetIterator$AlignmentMode/valueOf name)))

