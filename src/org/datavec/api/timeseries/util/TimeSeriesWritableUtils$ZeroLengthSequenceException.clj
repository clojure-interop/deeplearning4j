(ns org.datavec.api.timeseries.util.TimeSeriesWritableUtils$ZeroLengthSequenceException
  "Unchecked exception, thrown to signify that a zero-length sequence data set was encountered."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.timeseries.util TimeSeriesWritableUtils$ZeroLengthSequenceException]))

(defn ->zero-length-sequence-exception
  "Constructor.

  type - `java.lang.String`"
  (^TimeSeriesWritableUtils$ZeroLengthSequenceException [^java.lang.String type]
    (new TimeSeriesWritableUtils$ZeroLengthSequenceException type))
  (^TimeSeriesWritableUtils$ZeroLengthSequenceException []
    (new TimeSeriesWritableUtils$ZeroLengthSequenceException )))

