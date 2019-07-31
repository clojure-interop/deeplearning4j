(ns org.datavec.api.transform.reduce.Reducer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.reduce Reducer$Builder]))

(defn ->builder
  "Constructor.

  Create a Reducer builder, and set the default column reduction operation.
  For any columns that aren't specified explicitly, they will use the default reduction operation.
  If a column does have a reduction operation explicitly specified, then it will override
  the default specified here.

  default-op - Default reduction operation to perform - `org.datavec.api.transform.ReduceOp`"
  (^Reducer$Builder [^org.datavec.api.transform.ReduceOp default-op]
    (new Reducer$Builder default-op)))

(defn custom-reduction
  "Reduce the specified column using a custom column reduction functionality.

  column - Column to execute the custom reduction functionality on - `java.lang.String`
  column-reduction - Column reduction to execute on that column - `org.datavec.api.transform.reduce.AggregableColumnReduction`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String column ^org.datavec.api.transform.reduce.AggregableColumnReduction column-reduction]
    (-> this (.customReduction column column-reduction))))

(defn conditional-reduction
  "Conditional reduction: apply the reduces on a specified column, where the reduction occurs *only* on those
  examples where the condition returns true. Examples where the condition does not apply (returns false) are
  ignored/excluded.

  column - Name of the column to execute the conditional reduction on - `java.lang.String`
  output-names - `java.util.List`
  reductions - Reductions to execute - `java.util.List`
  condition - Condition to use in the reductions - `org.datavec.api.transform.condition.Condition`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String column ^java.util.List output-names ^java.util.List reductions ^org.datavec.api.transform.condition.Condition condition]
    (-> this (.conditionalReduction column output-names reductions condition))))

(defn count-unique-columns
  "Reduce the specified columns by counting the number of unique values

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.countUniqueColumns columns))))

(defn multiple-op-colmumns
  "ops - `java.util.List`
  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.util.List ops ^java.lang.String columns]
    (-> this (.multipleOpColmumns ops columns))))

(defn append-columns
  "Reduce the specified columns by taking the concatenation of all content
  Beware, the output will be huge!

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.appendColumns columns))))

(defn take-last-columns
  "Reduce the specified columns by taking the last value

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.takeLastColumns columns))))

(defn uncorrected-stdev-columns
  "Reduce the specified columns by taking the uncorrected standard deviation of the values

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.uncorrectedStdevColumns columns))))

(defn sum-columns
  "Reduce the specified columns by taking the sum of values

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.sumColumns columns))))

(defn build
  "returns: `org.datavec.api.transform.reduce.Reducer`"
  (^org.datavec.api.transform.reduce.Reducer [^Reducer$Builder this]
    (-> this (.build))))

(defn range-columns
  "Reduce the specified columns by taking the range (max-min) of the values

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.rangeColumns columns))))

(defn mean-columns
  "Reduce the specified columns by taking the mean of the values

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.meanColumns columns))))

(defn max-column
  "Reduce the specified columns by taking the maximum value

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.maxColumn columns))))

(defn population-variance
  "Reduce the specified columns by taking the population variance of the values

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.populationVariance columns))))

(defn key-columns
  "Specify the key columns. The idea here is to be able to create a (potentially compound) key
  out of multiple columns, using the toString representation of the values in these columns

  key-columns - Columns that will make up the key - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String key-columns]
    (-> this (.keyColumns key-columns))))

(defn min-columns
  "Reduce the specified columns by taking the minimum value

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.minColumns columns))))

(defn count-columns
  "Reduce the specified columns by counting the number of values

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.countColumns columns))))

(defn variance
  "Reduce the specified columns by taking the variance of the values

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.variance columns))))

(defn set-ignore-invalid
  "When doing the reduction: set the specified columns to ignore any invalid values.
  Invalid: defined as being not valid according to the ColumnMetaData: ColumnMetaData.isValid(Writable).
  For numerical columns, this typically means being unable to parse the Writable. For example, Writable.toLong() failing for a Long column.
  If the column has any restrictions (min/max values, regex for Strings etc) these will also be taken into account.

  columns - Columns to set 'ignore invalid' for - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.setIgnoreInvalid columns))))

(defn prod-columns
  "Reduce the specified columns by taking the product of values

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.prodColumns columns))))

(defn stdev-columns
  "Reduce the specified columns by taking the standard deviation of the values

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.stdevColumns columns))))

(defn prepend-columns
  "Reduce the specified columns by taking the concatenation of all content in the reverse order
  Beware, the output will be huge!

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.prependColumns columns))))

(defn take-first-columns
  "Reduce the specified columns by taking the first value

  columns - `java.lang.String`

  returns: `org.datavec.api.transform.reduce.Reducer$Builder`"
  (^org.datavec.api.transform.reduce.Reducer$Builder [^Reducer$Builder this ^java.lang.String columns]
    (-> this (.takeFirstColumns columns))))

