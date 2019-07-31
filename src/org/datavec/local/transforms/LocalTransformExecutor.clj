(ns org.datavec.local.transforms.LocalTransformExecutor
  "Local transform executor"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms LocalTransformExecutor]))

(defn ->local-transform-executor
  "Constructor."
  (^LocalTransformExecutor []
    (new LocalTransformExecutor )))

(def *-log-error-property
  "Static Constant.

  type: java.lang.String"
  LocalTransformExecutor/LOG_ERROR_PROPERTY)

(defn *convert-string-input-time-series
  "Convert a string time series to
  the proper writable set based on the schema.
  Note that this does not use arrow.
  This just uses normal writable objects.

  string-input - the string input - `java.util.List`
  schema - the schema to use - `org.datavec.api.transform.schema.Schema`

  returns: the converted records - `java.util.List<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.List [^java.util.List string-input ^org.datavec.api.transform.schema.Schema schema]
    (LocalTransformExecutor/convertStringInputTimeSeries string-input schema)))

(defn *execute-sequence-to-sequence
  "Execute the specified TransformProcess with the given sequence input data
  Note: this method can only be used if the TransformProcess starts with sequence data, and also returns sequence data

  input-sequence - Input sequence data to process - `java.util.List`
  transform-process - TransformProcess to execute - `org.datavec.api.transform.TransformProcess`

  returns: Processed (non-sequential) data - `java.util.List<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.List [^java.util.List input-sequence ^org.datavec.api.transform.TransformProcess transform-process]
    (LocalTransformExecutor/executeSequenceToSequence input-sequence transform-process)))

(defn *execute-to-sequence
  "Execute the specified TransformProcess with the given input data
  Note: this method can only be used if the TransformProcess
  starts with non-sequential data,
  but returns sequence
  data (after grouping or converting to a sequence as one of the steps)

  input-writables - Input data to process - `java.util.List`
  transform-process - TransformProcess to execute - `org.datavec.api.transform.TransformProcess`

  returns: Processed (sequence) data - `java.util.List<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.List [^java.util.List input-writables ^org.datavec.api.transform.TransformProcess transform-process]
    (LocalTransformExecutor/executeToSequence input-writables transform-process)))

(defn *convert-writable-input-to-string
  "Convert a string time series to
  the proper writable set based on the schema.
  Note that this does not use arrow.
  This just uses normal writable objects.

  string-input - the string input - `java.util.List`
  schema - the schema to use - `org.datavec.api.transform.schema.Schema`

  returns: the converted records - `java.util.List<java.util.List<java.lang.String>>`"
  (^java.util.List [^java.util.List string-input ^org.datavec.api.transform.schema.Schema schema]
    (LocalTransformExecutor/convertWritableInputToString string-input schema)))

(defn *execute-join
  "Execute a join on the specified data

  join - Join to execute - `org.datavec.api.transform.join.Join`
  left - Left data for join - `java.util.List`
  right - Right data for join - `java.util.List`

  returns: Joined data - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^org.datavec.api.transform.join.Join join ^java.util.List left ^java.util.List right]
    (LocalTransformExecutor/executeJoin join left right)))

(defn *execute
  "Execute the specified TransformProcess with the given input data
  Note: this method can only be used if the TransformProcess returns non-sequence data. For TransformProcesses
  that return a sequence, use executeToSequence(List, TransformProcess)

  input-writables - Input data to process - `java.util.List`
  transform-process - TransformProcess to execute - `org.datavec.api.transform.TransformProcess`

  returns: Processed data - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^java.util.List input-writables ^org.datavec.api.transform.TransformProcess transform-process]
    (LocalTransformExecutor/execute input-writables transform-process)))

(defn *convert-string-input
  "Convert a string time series to
  the proper writable set based on the schema.
  Note that this does not use arrow.
  This just uses normal writable objects.

  string-input - the string input - `java.util.List`
  schema - the schema to use - `org.datavec.api.transform.schema.Schema`

  returns: the converted records - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^java.util.List string-input ^org.datavec.api.transform.schema.Schema schema]
    (LocalTransformExecutor/convertStringInput string-input schema)))

(defn *try-catch?
  "Returns true if the executor
  is in try catch mode.

  returns: `boolean`"
  (^Boolean []
    (LocalTransformExecutor/isTryCatch )))

(defn *execute-sequence-to-separate
  "Execute the specified TransformProcess with the given sequence input data
  Note: this method can only be used if the TransformProcess starts with sequence data, but returns non-sequential
  data (after reducing or converting sequential data to individual examples)

  input-sequence - Input sequence data to process - `java.util.List`
  transform-process - TransformProcess to execute - `org.datavec.api.transform.TransformProcess`

  returns: Processed (non-sequential) data - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^java.util.List input-sequence ^org.datavec.api.transform.TransformProcess transform-process]
    (LocalTransformExecutor/executeSequenceToSeparate input-sequence transform-process)))

(defn *convert-writable-input-to-string-time-series
  "Convert a string time series to
  the proper writable set based on the schema.
  Note that this does not use arrow.
  This just uses normal writable objects.

  string-input - the string input - `java.util.List`
  schema - the schema to use - `org.datavec.api.transform.schema.Schema`

  returns: the converted records - `java.util.List<java.util.List<java.util.List<java.lang.String>>>`"
  (^java.util.List [^java.util.List string-input ^org.datavec.api.transform.schema.Schema schema]
    (LocalTransformExecutor/convertWritableInputToStringTimeSeries string-input schema)))

