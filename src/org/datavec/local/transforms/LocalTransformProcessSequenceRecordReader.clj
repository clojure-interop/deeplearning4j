(ns org.datavec.local.transforms.LocalTransformProcessSequenceRecordReader
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms LocalTransformProcessSequenceRecordReader]))

(defn ->local-transform-process-sequence-record-reader
  "Constructor.

  sequence-record-reader - `org.datavec.api.records.reader.SequenceRecordReader`
  transform-process - `org.datavec.api.transform.TransformProcess`"
  (^LocalTransformProcessSequenceRecordReader [^org.datavec.api.records.reader.SequenceRecordReader sequence-record-reader ^org.datavec.api.transform.TransformProcess transform-process]
    (new LocalTransformProcessSequenceRecordReader sequence-record-reader transform-process)))

(defn sequence-record
  "Description copied from class: TransformProcessSequenceRecordReader

  returns: a sequence of records - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^LocalTransformProcessSequenceRecordReader this]
    (-> this (.sequenceRecord))))

(defn next
  "Description copied from interface: RecordReader

  num - `int`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^LocalTransformProcessSequenceRecordReader this ^Integer num]
    (-> this (.next num)))
  (^java.util.List [^LocalTransformProcessSequenceRecordReader this]
    (-> this (.next))))

