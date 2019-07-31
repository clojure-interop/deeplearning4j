(ns org.datavec.api.util.ndarray.RecordConverter
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.util.ndarray RecordConverter]))

(defn *to-array
  "Convert a record to an INDArray. May contain a mix of Writables and row vector NDArrayWritables.

  record - the record to convert - `java.util.Collection`

  returns: the array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.util.Collection record]
    (RecordConverter/toArray record))
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.util.Collection record ^Integer size]
    (RecordConverter/toArray record size)))

(defn *to-records
  "Convert a set of records in to a matrix

  matrix - the records ot convert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the matrix for the records - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^org.nd4j.linalg.api.ndarray.INDArray matrix]
    (RecordConverter/toRecords matrix)))

(defn *to-tensor
  "Convert a set of records in to a matrix

  records - the records ot convert - `java.util.List`

  returns: the matrix for the records - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.util.List records]
    (RecordConverter/toTensor records)))

(defn *to-matrix
  "Convert a set of records in to a matrix

  records - the records ot convert - `java.util.List`

  returns: the matrix for the records - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.util.List records]
    (RecordConverter/toMatrix records)))

(defn *to-minibatch-array
  "Convert a record to an INDArray, for use in minibatch training. That is, for an input record of length N, the output
  array has dimension 0 of size N (i.e., suitable for minibatch training in DL4J, for example).
  The input list of writables must all be the same type (i.e., all NDArrayWritables or all non-array writables such
  as DoubleWritable etc).
  Note that for NDArrayWritables, they must have leading dimension 1, and all other dimensions must match.
  For example, row vectors are valid NDArrayWritables, as are 3d (usually time series) with shape [1, x, y], or
  4d (usually images) with shape [1, x, y, z] where (x,y,z) are the same for all inputs

  l - the records to convert - `java.util.List`

  returns: the array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.util.List l]
    (RecordConverter/toMinibatchArray l)))

(defn *to-record
  "Convert a collection into a `List`, i.e. a record that can be used with other datavec methods.
  Uses a schema to decide what kind of writable to use.

  schema - `org.datavec.api.transform.schema.Schema`
  source - `java.util.List`

  returns: a record - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^org.datavec.api.transform.schema.Schema schema ^java.util.List source]
    (RecordConverter/toRecord schema source))
  (^java.util.List [^org.nd4j.linalg.api.ndarray.INDArray array]
    (RecordConverter/toRecord array)))

