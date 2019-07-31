(ns org.datavec.api.transform.stringreduce.StringReducer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.stringreduce StringReducer$Builder]))

(defn ->builder
  "Constructor.

  Create a StringReducer builder, and set the default column reduction operation.
  For any columns that aren't specified explicitly, they will use the default reduction operation.
  If a column does have a reduction operation explicitly specified, then it will override
  the default specified here.

  default-op - Default reduction operation to perform - `org.datavec.api.transform.StringReduceOp`"
  (^StringReducer$Builder [^org.datavec.api.transform.StringReduceOp default-op]
    (new StringReducer$Builder default-op)))

(defn input-columns
  "input-columns - `java.util.List`

  returns: `org.datavec.api.transform.stringreduce.StringReducer$Builder`"
  (^org.datavec.api.transform.stringreduce.StringReducer$Builder [^StringReducer$Builder this ^java.util.List input-columns]
    (-> this (.inputColumns input-columns))))

(defn custom-reduction
  "Reduce the specified column using a custom column reduction functionality.

  column - Column to execute the custom reduction functionality on - `java.lang.String`
  column-reduction - Column reduction to execute on that column - `org.datavec.api.transform.reduce.ColumnReduction`

  returns: `org.datavec.api.transform.stringreduce.StringReducer$Builder`"
  (^org.datavec.api.transform.stringreduce.StringReducer$Builder [^StringReducer$Builder this ^java.lang.String column ^org.datavec.api.transform.reduce.ColumnReduction column-reduction]
    (-> this (.customReduction column column-reduction))))

(defn output-column-name
  "output-column-name - `java.lang.String`

  returns: `org.datavec.api.transform.stringreduce.StringReducer$Builder`"
  (^org.datavec.api.transform.stringreduce.StringReducer$Builder [^StringReducer$Builder this ^java.lang.String output-column-name]
    (-> this (.outputColumnName output-column-name))))

(defn append-columns
  "Reduce the specified columns by taking the minimum value

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.stringreduce.StringReducer$Builder`"
  (^org.datavec.api.transform.stringreduce.StringReducer$Builder [^StringReducer$Builder this ^java.lang.String columns]
    (-> this (.appendColumns columns))))

(defn merge-columns
  "Reduce the specified columns by taking the sum of values

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.stringreduce.StringReducer$Builder`"
  (^org.datavec.api.transform.stringreduce.StringReducer$Builder [^StringReducer$Builder this ^java.lang.String columns]
    (-> this (.mergeColumns columns))))

(defn replace-column
  "Reduce the specified columns by taking the mean of the values

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.stringreduce.StringReducer$Builder`"
  (^org.datavec.api.transform.stringreduce.StringReducer$Builder [^StringReducer$Builder this ^java.lang.String columns]
    (-> this (.replaceColumn columns))))

(defn build
  "returns: `org.datavec.api.transform.stringreduce.StringReducer`"
  (^org.datavec.api.transform.stringreduce.StringReducer [^StringReducer$Builder this]
    (-> this (.build))))

(defn set-ignore-invalid
  "When doing the reduction: set the specified columns to ignore any invalid values.
  Invalid: defined as being not valid according to the ColumnMetaData: ColumnMetaData.isValid(Writable).
  For numerical columns, this typically means being unable to parse the Writable. For example, Writable.toLong() failing for a Long column.
  If the column has any restrictions (min/max values, regex for Strings etc) these will also be taken into account.

  columns - Columns to set 'ignore invalid' for - `java.lang.String`

  returns: `org.datavec.api.transform.stringreduce.StringReducer$Builder`"
  (^org.datavec.api.transform.stringreduce.StringReducer$Builder [^StringReducer$Builder this ^java.lang.String columns]
    (-> this (.setIgnoreInvalid columns))))

(defn prepend-columns
  "Reduce the specified columns by taking the maximum value

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.stringreduce.StringReducer$Builder`"
  (^org.datavec.api.transform.stringreduce.StringReducer$Builder [^StringReducer$Builder this ^java.lang.String columns]
    (-> this (.prependColumns columns))))

