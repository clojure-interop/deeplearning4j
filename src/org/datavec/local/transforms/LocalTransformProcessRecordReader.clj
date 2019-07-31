(ns org.datavec.local.transforms.LocalTransformProcessRecordReader
  "A wrapper around the TransformProcessRecordReader
 that uses the LocalTransformExecutor
 instead of the TransformProcess methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms LocalTransformProcessRecordReader]))

(defn ->local-transform-process-record-reader
  "Constructor.

  Initialize with the internal record reader
  and the transform process.

  record-reader - `org.datavec.api.records.reader.RecordReader`
  transform-process - `org.datavec.api.transform.TransformProcess`"
  (^LocalTransformProcessRecordReader [^org.datavec.api.records.reader.RecordReader record-reader ^org.datavec.api.transform.TransformProcess transform-process]
    (new LocalTransformProcessRecordReader record-reader transform-process)))

