(ns org.deeplearning4j.ui.stats.api.Histogram
  "Histogram: values for a single histogram.
 Assumption here is that the N bins are equally split between the min and max.
 So, for nBins = 3, we have: Step = (max-min)/3.
 First bin have bounds (min, min  1 * step); second bin would have bounds (min  1 * step, min  2 * step) and so on"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.api Histogram]))

(defn ->histogram
  "Constructor."
  (^Histogram []
    (new Histogram )))

