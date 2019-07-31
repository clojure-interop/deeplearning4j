(ns org.datavec.api.transform.reduce.AggregableReductionUtils
  "Various utilities for performing reductions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.reduce AggregableReductionUtils]))

(defn *reduce-column
  "op - `java.util.List`
  type - `org.datavec.api.transform.ColumnType`
  ignore-invalid - `boolean`
  meta-data - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.datavec.api.transform.ops.IAggregableReduceOp [^java.util.List op ^org.datavec.api.transform.ColumnType type ^Boolean ignore-invalid ^org.datavec.api.transform.metadata.ColumnMetaData meta-data]
    (AggregableReductionUtils/reduceColumn op type ignore-invalid meta-data)))

(defn *reduce-int-column
  "lop - `java.util.List`
  ignore-invalid - `boolean`
  meta-data - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.datavec.api.transform.ops.IAggregableReduceOp [^java.util.List lop ^Boolean ignore-invalid ^org.datavec.api.transform.metadata.ColumnMetaData meta-data]
    (AggregableReductionUtils/reduceIntColumn lop ignore-invalid meta-data)))

(defn *reduce-long-column
  "lop - `java.util.List`
  ignore-invalid - `boolean`
  meta-data - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.datavec.api.transform.ops.IAggregableReduceOp [^java.util.List lop ^Boolean ignore-invalid ^org.datavec.api.transform.metadata.ColumnMetaData meta-data]
    (AggregableReductionUtils/reduceLongColumn lop ignore-invalid meta-data)))

(defn *reduce-float-column
  "lop - `java.util.List`
  ignore-invalid - `boolean`
  meta-data - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.datavec.api.transform.ops.IAggregableReduceOp [^java.util.List lop ^Boolean ignore-invalid ^org.datavec.api.transform.metadata.ColumnMetaData meta-data]
    (AggregableReductionUtils/reduceFloatColumn lop ignore-invalid meta-data)))

(defn *reduce-double-column
  "lop - `java.util.List`
  ignore-invalid - `boolean`
  meta-data - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.datavec.api.transform.ops.IAggregableReduceOp [^java.util.List lop ^Boolean ignore-invalid ^org.datavec.api.transform.metadata.ColumnMetaData meta-data]
    (AggregableReductionUtils/reduceDoubleColumn lop ignore-invalid meta-data)))

(defn *reduce-string-or-categorical-column
  "lop - `java.util.List`
  ignore-invalid - `boolean`
  meta-data - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.datavec.api.transform.ops.IAggregableReduceOp [^java.util.List lop ^Boolean ignore-invalid ^org.datavec.api.transform.metadata.ColumnMetaData meta-data]
    (AggregableReductionUtils/reduceStringOrCategoricalColumn lop ignore-invalid meta-data)))

(defn *reduce-time-column
  "lop - `java.util.List`
  ignore-invalid - `boolean`
  meta-data - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.datavec.api.transform.ops.IAggregableReduceOp [^java.util.List lop ^Boolean ignore-invalid ^org.datavec.api.transform.metadata.ColumnMetaData meta-data]
    (AggregableReductionUtils/reduceTimeColumn lop ignore-invalid meta-data)))

(defn *reduce-bytes-column
  "lop - `java.util.List`
  ignore-invalid - `boolean`
  meta-data - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.datavec.api.transform.ops.IAggregableReduceOp [^java.util.List lop ^Boolean ignore-invalid ^org.datavec.api.transform.metadata.ColumnMetaData meta-data]
    (AggregableReductionUtils/reduceBytesColumn lop ignore-invalid meta-data)))

