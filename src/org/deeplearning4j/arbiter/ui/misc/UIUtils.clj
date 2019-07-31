(ns org.deeplearning4j.arbiter.ui.misc.UIUtils
  "Created by Alex on 20/07/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.ui.misc UIUtils]))

(defn ->ui-utils
  "Constructor."
  (^UIUtils []
    (new UIUtils )))

(defn *graph-nice-range
  "Convert the \"messy\" min/max values on a dataset to something clean. For example, 0.895732 becomes 1.0

  max - Maximum data point value - `double`
  min - Minimum data point value - `double`
  n-tick - Number of tick marks desired on chart (good setting: 5) - `int`

  returns: double[] of length 2 - with new minimum and maximum - `double[]`"
  ([^Double max ^Double min ^Integer n-tick]
    (UIUtils/graphNiceRange max min n-tick)))

(defn *nice-num
  "x - `double`
  round - `boolean`

  returns: `double`"
  (^Double [^Double x ^Boolean round]
    (UIUtils/niceNum x round)))

(defn *format-duration
  "Format the duration in milliseconds to a human readable String, with \"yr\", \"days\", \"hr\" etc prefixes

  duration-ms - Duration in milliseconds - `long`

  returns: Human readable string - `java.lang.String`"
  (^java.lang.String [^Long duration-ms]
    (UIUtils/formatDuration duration-ms)))

