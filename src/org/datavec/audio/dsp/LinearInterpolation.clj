(ns org.datavec.audio.dsp.LinearInterpolation
  "Construct new data points within the range of a discrete set of known data points by linear equation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.dsp LinearInterpolation]))

(defn ->linear-interpolation
  "Constructor."
  (^LinearInterpolation []
    (new LinearInterpolation )))

(defn interpolate
  "Do interpolation on the samples according to the original and destinated sample rates

  old-sample-rate - sample rate of the original samples - `int`
  new-sample-rate - sample rate of the interpolated samples - `int`
  samples - original samples - `short[]`

  returns: interpolated samples - `short[]`"
  ([^LinearInterpolation this ^Integer old-sample-rate ^Integer new-sample-rate samples]
    (-> this (.interpolate old-sample-rate new-sample-rate samples))))

