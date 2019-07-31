(ns org.datavec.api.records.reader.impl.csv.CSVMultiSequenceRecordReader$Mode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.csv CSVMultiSequenceRecordReader$Mode]))

(def CONCAT
  "Enum Constant.

  type: org.datavec.api.records.reader.impl.csv.CSVMultiSequenceRecordReader$Mode"
  CSVMultiSequenceRecordReader$Mode/CONCAT)

(def EQUAL_LENGTH
  "Enum Constant.

  type: org.datavec.api.records.reader.impl.csv.CSVMultiSequenceRecordReader$Mode"
  CSVMultiSequenceRecordReader$Mode/EQUAL_LENGTH)

(def PAD
  "Enum Constant.

  type: org.datavec.api.records.reader.impl.csv.CSVMultiSequenceRecordReader$Mode"
  CSVMultiSequenceRecordReader$Mode/PAD)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (CSVMultiSequenceRecordReader.Mode c : CSVMultiSequenceRecordReader.Mode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.records.reader.impl.csv.CSVMultiSequenceRecordReader$Mode[]`"
  ([]
    (CSVMultiSequenceRecordReader$Mode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.records.reader.impl.csv.CSVMultiSequenceRecordReader$Mode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.records.reader.impl.csv.CSVMultiSequenceRecordReader$Mode [^java.lang.String name]
    (CSVMultiSequenceRecordReader$Mode/valueOf name)))

