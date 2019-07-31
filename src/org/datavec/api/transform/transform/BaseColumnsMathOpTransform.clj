(ns org.datavec.api.transform.transform.BaseColumnsMathOpTransform
  "Base class for multiple column math operations. For example myNewColumn = column1  column2  column3.
 Note: this transform adds a (derived) column (with the specified name) to the end

 Note: Certain operations have restrictions on the number of columns used as input
 Add: 2 or more (a+b+c+...)
 Subtract: exactly 2 (a-b)
 Multiply: 2 or more (a*b*c*...)
 Divide: exactly 2 (a/b)
 Modulus: exactly 2 (a%b)
 Other math ops (ReverseSubtract, ReverseDivide, ScalarMin, ScalarMax) are not allowed here.




 See: IntegerMathOpTransform, DoubleMathOpTransform, LongMathOpTransform for operations
 with a scalar  single column, instea"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform BaseColumnsMathOpTransform]))

(defn ->base-columns-math-op-transform
  "Constructor.

  new-column-name - `java.lang.String`
  math-op - `org.datavec.api.transform.MathOp`
  columns - `java.lang.String`"
  (^BaseColumnsMathOpTransform [^java.lang.String new-column-name ^org.datavec.api.transform.MathOp math-op ^java.lang.String columns]
    (new BaseColumnsMathOpTransform new-column-name math-op columns)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^BaseColumnsMathOpTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^BaseColumnsMathOpTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^BaseColumnsMathOpTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseColumnsMathOpTransform this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^BaseColumnsMathOpTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^BaseColumnsMathOpTransform this]
    (-> this (.getInputSchema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^BaseColumnsMathOpTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^BaseColumnsMathOpTransform this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^BaseColumnsMathOpTransform this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^BaseColumnsMathOpTransform this]
    (-> this (.columnName))))

