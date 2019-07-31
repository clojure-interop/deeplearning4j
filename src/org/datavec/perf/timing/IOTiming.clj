(ns org.datavec.perf.timing.IOTiming
  "Timing components of a data vec pipeline
 consisting of:
 RecordReader, InputStreamInputSplit
 (note that this uses input stream input split,
 the record reader must support InputStreamInputSplit for this to work)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.perf.timing IOTiming]))

(defn ->io-timing
  "Constructor."
  (^IOTiming []
    (new IOTiming )))

(defn *average-file-read
  "Returns statistics for components of a datavec pipeline
  averaged over the specified number of times

  n-times - the number of times to run the pipeline for averaging - `long`
  record-reader - the record reader - `org.datavec.api.records.reader.RecordReader`
  file - the file to read - `java.io.File`
  function - the function - `org.datavec.perf.timing.IOTiming$INDArrayCreationFunction`

  returns: the averaged TimingStatistics for input/output on a record
  reader and ndarray creation (based on the given function - `org.datavec.perf.timing.TimingStatistics`

  throws: java.lang.Exception"
  (^org.datavec.perf.timing.TimingStatistics [^Long n-times ^org.datavec.api.records.reader.RecordReader record-reader ^java.io.File file ^org.datavec.perf.timing.IOTiming$INDArrayCreationFunction function]
    (IOTiming/averageFileRead n-times record-reader file function)))

(defn *time-nd-array-creation
  "reader - `org.datavec.api.records.reader.RecordReader`
  input-stream - `java.io.InputStream`
  function - `org.datavec.perf.timing.IOTiming$INDArrayCreationFunction`

  returns: `org.datavec.perf.timing.TimingStatistics`

  throws: java.lang.Exception"
  (^org.datavec.perf.timing.TimingStatistics [^org.datavec.api.records.reader.RecordReader reader ^java.io.InputStream input-stream ^org.datavec.perf.timing.IOTiming$INDArrayCreationFunction function]
    (IOTiming/timeNDArrayCreation reader input-stream function)))

