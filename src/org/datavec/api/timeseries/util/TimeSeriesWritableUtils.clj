(ns org.datavec.api.timeseries.util.TimeSeriesWritableUtils
  "Simple utils for converting Writable s
 lists to INDArray"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.timeseries.util TimeSeriesWritableUtils]))

(defn ->time-series-writable-utils
  "Constructor."
  (^TimeSeriesWritableUtils []
    (new TimeSeriesWritableUtils )))

(defn *get-details
  "Get the TimeSeriesWritableUtils.RecordDetails
  detailing the length of the time series

  record - the input time seriesto get the details for - `java.util.List`

  returns: the record details for the record - `org.datavec.api.timeseries.util.TimeSeriesWritableUtils$RecordDetails`"
  (^org.datavec.api.timeseries.util.TimeSeriesWritableUtils$RecordDetails [^java.util.List record]
    (TimeSeriesWritableUtils/getDetails record)))

(defn *convert-writables-sequence
  "Convert the writables
  to a sequence (3d) data set,
  and also return the
  mask array (if necessary)

  list - `java.util.List`
  details - `org.datavec.api.timeseries.util.TimeSeriesWritableUtils$RecordDetails`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^java.util.List list ^org.datavec.api.timeseries.util.TimeSeriesWritableUtils$RecordDetails details]
    (TimeSeriesWritableUtils/convertWritablesSequence list details))
  (^org.nd4j.linalg.primitives.Pair [^java.util.List time-series-record]
    (TimeSeriesWritableUtils/convertWritablesSequence time-series-record)))

