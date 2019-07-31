(ns org.datavec.arrow.ArrowConverter
  "Interop between datavec primitives and arrow.
 This allows for datavec schemas and primitives
 to be converted to the arrow format."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.arrow ArrowConverter]))

(defn ->arrow-converter
  "Constructor."
  (^ArrowConverter []
    (new ArrowConverter )))

(defn *to-arrow-writables
  "Convert the input field vectors (the input data) and
  the given schema to a proper list of writables.

  field-vectors - the field vectors to use - `java.util.List`
  schema - the schema to use - `org.datavec.api.transform.schema.Schema`

  returns: the equivalent datavec batch given the input data - `org.datavec.arrow.recordreader.ArrowWritableRecordBatch`"
  (^org.datavec.arrow.recordreader.ArrowWritableRecordBatch [^java.util.List field-vectors ^org.datavec.api.transform.schema.Schema schema]
    (ArrowConverter/toArrowWritables field-vectors schema)))

(defn *double-field
  "Shortcut method for creating a double field
  with 64 bit floating point

  name - the name of the field - `java.lang.String`

  returns: the created field - `org.apache.arrow.vector.types.pojo.Field`"
  (^org.apache.arrow.vector.types.pojo.Field [^java.lang.String name]
    (ArrowConverter/doubleField name)))

(defn *string-vector-of
  "allocator - `org.apache.arrow.memory.BufferAllocator`
  name - `java.lang.String`
  length - the length of the vector - `int`

  returns: `org.apache.arrow.vector.VarCharVector`"
  (^org.apache.arrow.vector.VarCharVector [^org.apache.arrow.memory.BufferAllocator allocator ^java.lang.String name ^Integer length]
    (ArrowConverter/stringVectorOf allocator name length)))

(defn *convert-arrow-vector
  "Convert a field vector to a column vector

  field-vector - the field vector to convert - `org.apache.arrow.vector.FieldVector`
  type - the type of the column vector - `org.datavec.api.transform.ColumnType`

  returns: the converted ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.apache.arrow.vector.FieldVector field-vector ^org.datavec.api.transform.ColumnType type]
    (ArrowConverter/convertArrowVector field-vector type)))

(defn *vector-for
  "Returns a vector representing a tensor view
  of each ndarray.
  Each ndarray will be a \"row\" represented as a tensor object
  with in the return VarBinaryVector

  buffer-allocator - the buffer allocator to use - `org.apache.arrow.memory.BufferAllocator`
  name - the name of the column - `java.lang.String`
  data - the input arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: `org.apache.arrow.vector.VarBinaryVector`"
  (^org.apache.arrow.vector.VarBinaryVector [^org.apache.arrow.memory.BufferAllocator buffer-allocator ^java.lang.String name data]
    (ArrowConverter/vectorFor buffer-allocator name data)))

(defn *time-vector-of
  "allocator - `org.apache.arrow.memory.BufferAllocator`
  name - `java.lang.String`
  length - the length of the vector - `int`

  returns: `org.apache.arrow.vector.TimeStampMilliVector`"
  (^org.apache.arrow.vector.TimeStampMilliVector [^org.apache.arrow.memory.BufferAllocator allocator ^java.lang.String name ^Integer length]
    (ArrowConverter/timeVectorOf allocator name length)))

(defn *to-datavec-schema
  "Convert an Schema
  to a datavec Schema

  schema - the input arrow schema - `org.apache.arrow.vector.types.pojo.Schema`

  returns: the equivalent datavec schema - `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^org.apache.arrow.vector.types.pojo.Schema schema]
    (ArrowConverter/toDatavecSchema schema)))

(defn *read-from-file
  "Read a datavec schema and record set
  from the given arrow file.

  input - the input to read - `java.io.FileInputStream`

  returns: the associated datavec schema and record - `org.nd4j.linalg.primitives.Pair<org.datavec.api.transform.schema.Schema,org.datavec.arrow.recordreader.ArrowWritableRecordBatch>`

  throws: java.io.IOException"
  (^org.nd4j.linalg.primitives.Pair [^java.io.FileInputStream input]
    (ArrowConverter/readFromFile input)))

(defn *to-arrow-columns-string-single
  "Convert a set of input strings to arrow columns

  buffer-allocator - the buffer allocator to use - `org.apache.arrow.memory.BufferAllocator`
  schema - the schema to use - `org.datavec.api.transform.schema.Schema`
  data-vec-record - the collection of input strings to process - `java.util.List`

  returns: the created vectors - `java.util.List<org.apache.arrow.vector.FieldVector>`"
  (^java.util.List [^org.apache.arrow.memory.BufferAllocator buffer-allocator ^org.datavec.api.transform.schema.Schema schema ^java.util.List data-vec-record]
    (ArrowConverter/toArrowColumnsStringSingle buffer-allocator schema data-vec-record)))

(defn *to-arrow-columns-time-series-helper
  "Convert a set of input strings to arrow columns
  for a time series.

  buffer-allocator - the buffer allocator to use - `org.apache.arrow.memory.BufferAllocator`
  schema - the schema to use - `org.datavec.api.transform.schema.Schema`
  data-vec-record - the collection of input strings to process - `java.util.List`

  returns: the created vectors - `<T> java.util.List<org.apache.arrow.vector.FieldVector>`"
  ([^org.apache.arrow.memory.BufferAllocator buffer-allocator ^org.datavec.api.transform.schema.Schema schema ^java.util.List data-vec-record]
    (ArrowConverter/toArrowColumnsTimeSeriesHelper buffer-allocator schema data-vec-record)))

(defn *double-vector-of
  "allocator - `org.apache.arrow.memory.BufferAllocator`
  name - `java.lang.String`
  length - the length of the vector - `int`

  returns: `org.apache.arrow.vector.Float8Vector`"
  (^org.apache.arrow.vector.Float8Vector [^org.apache.arrow.memory.BufferAllocator allocator ^java.lang.String name ^Integer length]
    (ArrowConverter/doubleVectorOf allocator name length)))

(defn *read-from-bytes
  "Read a datavec schema and record set
  from the given bytes (usually expected to be an arrow format file)

  input - the input to read - `byte[]`

  returns: the associated datavec schema and record - `org.nd4j.linalg.primitives.Pair<org.datavec.api.transform.schema.Schema,org.datavec.arrow.recordreader.ArrowWritableRecordBatch>`

  throws: java.io.IOException"
  (^org.nd4j.linalg.primitives.Pair [input]
    (ArrowConverter/readFromBytes input)))

(defn *boolean-vector-of
  "allocator - `org.apache.arrow.memory.BufferAllocator`
  name - `java.lang.String`
  length - `int`

  returns: `org.apache.arrow.vector.BitVector`"
  (^org.apache.arrow.vector.BitVector [^org.apache.arrow.memory.BufferAllocator allocator ^java.lang.String name ^Integer length]
    (ArrowConverter/booleanVectorOf allocator name length)))

(defn *write-record-batch-to
  "Write the records to the given output stream

  buffer-allocator - `org.apache.arrow.memory.BufferAllocator`
  record-batch - the record batch to write - `java.util.List`
  input-schema - the input schema - `org.datavec.api.transform.schema.Schema`
  output-stream - the output stream to write to - `java.io.OutputStream`"
  ([^org.apache.arrow.memory.BufferAllocator buffer-allocator ^java.util.List record-batch ^org.datavec.api.transform.schema.Schema input-schema ^java.io.OutputStream output-stream]
    (ArrowConverter/writeRecordBatchTo buffer-allocator record-batch input-schema output-stream))
  ([^java.util.List record-batch ^org.datavec.api.transform.schema.Schema input-schema ^java.io.OutputStream output-stream]
    (ArrowConverter/writeRecordBatchTo record-batch input-schema output-stream)))

(defn *field
  "Shortcut method for returning a field
  given an arrow type and name
  with no sub fields

  name - the name of the field - `java.lang.String`
  arrow-type - the arrow type of the field - `org.apache.arrow.vector.types.pojo.ArrowType`

  returns: the resulting field - `org.apache.arrow.vector.types.pojo.Field`"
  (^org.apache.arrow.vector.types.pojo.Field [^java.lang.String name ^org.apache.arrow.vector.types.pojo.ArrowType arrow-type]
    (ArrowConverter/field name arrow-type)))

(defn *float-vector-of
  "allocator - `org.apache.arrow.memory.BufferAllocator`
  name - `java.lang.String`
  length - the length of the vector - `int`

  returns: `org.apache.arrow.vector.Float4Vector`"
  (^org.apache.arrow.vector.Float4Vector [^org.apache.arrow.memory.BufferAllocator allocator ^java.lang.String name ^Integer length]
    (ArrowConverter/floatVectorOf allocator name length)))

(defn *float-field
  "Shortcut method for creating a double field
  with 32 bit floating point

  name - the name of the field - `java.lang.String`

  returns: the created field - `org.apache.arrow.vector.types.pojo.Field`"
  (^org.apache.arrow.vector.types.pojo.Field [^java.lang.String name]
    (ArrowConverter/floatField name)))

(defn *to-arrow-writables-time-series
  "Convert the input field vectors (the input data) and
  the given schema to a proper list of writables.

  field-vectors - the field vectors to use - `java.util.List`
  schema - the schema to use - `org.datavec.api.transform.schema.Schema`
  time-series-length - the length of the time series - `int`

  returns: the equivalent datavec batch given the input data - `java.util.List<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.List [^java.util.List field-vectors ^org.datavec.api.transform.schema.Schema schema ^Integer time-series-length]
    (ArrowConverter/toArrowWritablesTimeSeries field-vectors schema time-series-length)))

(defn *to-arrow-columns
  "Given a buffer allocator and datavec schema,
  convert the passed in batch of records
  to a set of arrow columns

  buffer-allocator - the buffer allocator to use - `org.apache.arrow.memory.BufferAllocator`
  schema - the schema to convert - `org.datavec.api.transform.schema.Schema`
  data-vec-record - the data vec record batch to convert - `java.util.List`

  returns: the converted list of FieldVector - `java.util.List<org.apache.arrow.vector.FieldVector>`"
  (^java.util.List [^org.apache.arrow.memory.BufferAllocator buffer-allocator ^org.datavec.api.transform.schema.Schema schema ^java.util.List data-vec-record]
    (ArrowConverter/toArrowColumns buffer-allocator schema data-vec-record)))

(defn *ndarray-vector-of
  "Create an ndarray vector that stores structs
  of INDArray
  based on the Tensor
  format

  allocator - the allocator to use - `org.apache.arrow.memory.BufferAllocator`
  name - the name of the vector - `java.lang.String`
  length - the number of vectors to store - `int`

  returns: `org.apache.arrow.vector.VarBinaryVector`"
  (^org.apache.arrow.vector.VarBinaryVector [^org.apache.arrow.memory.BufferAllocator allocator ^java.lang.String name ^Integer length]
    (ArrowConverter/ndarrayVectorOf allocator name length)))

(defn *from-entry
  "Based on an input ColumnType
  get an entry from a FieldVector

  item - the row of the item to get from the column vector - `int`
  from - the column vector from - `org.apache.arrow.vector.FieldVector`
  column-type - the column type - `org.datavec.api.transform.ColumnType`

  returns: the resulting writable - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^Integer item ^org.apache.arrow.vector.FieldVector from ^org.datavec.api.transform.ColumnType column-type]
    (ArrowConverter/fromEntry item from column-type)))

(defn *to-arrow-schema
  "Convert a data vec Schema
  to an arrow Schema

  schema - the input schema - `org.datavec.api.transform.schema.Schema`

  returns: the schema for arrow - `org.apache.arrow.vector.types.pojo.Schema`"
  (^org.apache.arrow.vector.types.pojo.Schema [^org.datavec.api.transform.schema.Schema schema]
    (ArrowConverter/toArrowSchema schema)))

(defn *get-field-for-column
  "Create a field given the input ColumnType
  and name

  name - the name of the field - `java.lang.String`
  column-type - the column type to add - `org.datavec.api.transform.ColumnType`

  returns: `org.apache.arrow.vector.types.pojo.Field`"
  (^org.apache.arrow.vector.types.pojo.Field [^java.lang.String name ^org.datavec.api.transform.ColumnType column-type]
    (ArrowConverter/getFieldForColumn name column-type)))

(defn *long-field
  "Shortcut method for creating a long field
  with 64 bit long field

  name - the name of the field - `java.lang.String`

  returns: the created field - `org.apache.arrow.vector.types.pojo.Field`"
  (^org.apache.arrow.vector.types.pojo.Field [^java.lang.String name]
    (ArrowConverter/longField name)))

(defn *set-value
  "Set the value of the specified column vector
  at the specified row based on the given value.
  The value will be converted relative to the specified column type.
  Note that the passed in value may only be a Writable
  or a String

  column-type - the column type of the value - `org.datavec.api.transform.ColumnType`
  field-vector - the field vector to set - `org.apache.arrow.vector.FieldVector`
  value - the value to set (Writable or String types) - `java.lang.Object`
  row - the row of the item - `int`"
  ([^org.datavec.api.transform.ColumnType column-type ^org.apache.arrow.vector.FieldVector field-vector ^java.lang.Object value ^Integer row]
    (ArrowConverter/setValue column-type field-vector value row)))

(defn *int-vector-of
  "allocator - `org.apache.arrow.memory.BufferAllocator`
  name - `java.lang.String`
  length - `int`

  returns: `org.apache.arrow.vector.IntVector`"
  (^org.apache.arrow.vector.IntVector [^org.apache.arrow.memory.BufferAllocator allocator ^java.lang.String name ^Integer length]
    (ArrowConverter/intVectorOf allocator name length)))

(defn *provider-for-vectors
  "Provide a value look up dictionary based on the
  given set of input FieldVector s for
  reading and writing to arrow streams

  vectors - the vectors to use as a lookup - `java.util.List`
  fields - `java.util.List`

  returns: the associated DictionaryProvider for the given
  input FieldVector list - `org.apache.arrow.vector.dictionary.DictionaryProvider`"
  (^org.apache.arrow.vector.dictionary.DictionaryProvider [^java.util.List vectors ^java.util.List fields]
    (ArrowConverter/providerForVectors vectors fields)))

(defn *string-field
  "name - `java.lang.String`

  returns: `org.apache.arrow.vector.types.pojo.Field`"
  (^org.apache.arrow.vector.types.pojo.Field [^java.lang.String name]
    (ArrowConverter/stringField name)))

(defn *boolean-field
  "Shortcut

  name - `java.lang.String`

  returns: `org.apache.arrow.vector.types.pojo.Field`"
  (^org.apache.arrow.vector.types.pojo.Field [^java.lang.String name]
    (ArrowConverter/booleanField name)))

(defn *int-field
  "Shortcut method for creating a double field
  with 32 bit integer field

  name - the name of the field - `java.lang.String`

  returns: the created field - `org.apache.arrow.vector.types.pojo.Field`"
  (^org.apache.arrow.vector.types.pojo.Field [^java.lang.String name]
    (ArrowConverter/intField name)))

(defn *to-array
  "Create an ndarray from a matrix.
  The included batch must be all the same number of rows in order
  to work. The reason for this is INDArray must be all the same dimensions.
  Note that the input columns must also be numerical. If they aren't numerical already,
  consider using an TransformProcess to transform the data
  output from ArrowRecordReader in to the proper format
  for usage with this method for direct conversion.

  arrow-writable-record-batch - the incoming batch. This is typically output froman ArrowRecordReader - `org.datavec.arrow.recordreader.ArrowWritableRecordTimeSeriesBatch`

  returns: an INDArray representative of the input data - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.datavec.arrow.recordreader.ArrowWritableRecordTimeSeriesBatch arrow-writable-record-batch]
    (ArrowConverter/toArray arrow-writable-record-batch)))

(defn *convert-to-arrow-vector
  "Convert an INDArray
  to a list of column vectors or a singleton
  list when either a row vector or a column vector

  from - the input array - `org.nd4j.linalg.api.ndarray.INDArray`
  name - the name of the vector - `java.util.List`
  type - the type of the vector - `org.datavec.api.transform.ColumnType`
  buffer-allocator - the allocator to use - `org.apache.arrow.memory.BufferAllocator`

  returns: the list of field vectors - `java.util.List<org.apache.arrow.vector.FieldVector>`"
  (^java.util.List [^org.nd4j.linalg.api.ndarray.INDArray from ^java.util.List name ^org.datavec.api.transform.ColumnType type ^org.apache.arrow.memory.BufferAllocator buffer-allocator]
    (ArrowConverter/convertToArrowVector from name type buffer-allocator)))

(defn *to-arrow-writables-single
  "Return a singular record based on the converted
  writables result.

  field-vectors - the field vectors to use - `java.util.List`
  schema - the schema to use for input - `org.datavec.api.transform.schema.Schema`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^java.util.List field-vectors ^org.datavec.api.transform.schema.Schema schema]
    (ArrowConverter/toArrowWritablesSingle field-vectors schema)))

(defn *long-vector-of
  "allocator - `org.apache.arrow.memory.BufferAllocator`
  name - `java.lang.String`
  length - the number of rows in the column vector - `int`

  returns: `org.apache.arrow.vector.BigIntVector`"
  (^org.apache.arrow.vector.BigIntVector [^org.apache.arrow.memory.BufferAllocator allocator ^java.lang.String name ^Integer length]
    (ArrowConverter/longVectorOf allocator name length)))

(defn *to-arrow-columns-string-time-series
  "Convert a set of input strings to arrow columns
  for a time series.

  buffer-allocator - the buffer allocator to use - `org.apache.arrow.memory.BufferAllocator`
  schema - the schema to use - `org.datavec.api.transform.schema.Schema`
  data-vec-record - the collection of input strings to process - `java.util.List`

  returns: the created vectors - `java.util.List<org.apache.arrow.vector.FieldVector>`"
  (^java.util.List [^org.apache.arrow.memory.BufferAllocator buffer-allocator ^org.datavec.api.transform.schema.Schema schema ^java.util.List data-vec-record]
    (ArrowConverter/toArrowColumnsStringTimeSeries buffer-allocator schema data-vec-record)))

(defn *to-arrow-columns-time-series
  "Convert a set of input strings to arrow columns
  for a time series.

  buffer-allocator - the buffer allocator to use - `org.apache.arrow.memory.BufferAllocator`
  schema - the schema to use - `org.datavec.api.transform.schema.Schema`
  data-vec-record - the collection of input strings to process - `java.util.List`

  returns: the created vectors - `java.util.List<org.apache.arrow.vector.FieldVector>`"
  (^java.util.List [^org.apache.arrow.memory.BufferAllocator buffer-allocator ^org.datavec.api.transform.schema.Schema schema ^java.util.List data-vec-record]
    (ArrowConverter/toArrowColumnsTimeSeries buffer-allocator schema data-vec-record)))

(defn *to-arrow-columns-string
  "Convert a set of input strings to arrow columns

  buffer-allocator - the buffer allocator to use - `org.apache.arrow.memory.BufferAllocator`
  schema - the schema to use - `org.datavec.api.transform.schema.Schema`
  data-vec-record - the collection of input strings to process - `java.util.List`

  returns: the created vectors - `java.util.List<org.apache.arrow.vector.FieldVector>`"
  (^java.util.List [^org.apache.arrow.memory.BufferAllocator buffer-allocator ^org.datavec.api.transform.schema.Schema schema ^java.util.List data-vec-record]
    (ArrowConverter/toArrowColumnsString buffer-allocator schema data-vec-record)))

