(ns org.datavec.audio.dsp.Resampler
  "Resample signal data (base on bytes)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.dsp Resampler]))

(defn ->resampler
  "Constructor."
  (^Resampler []
    (new Resampler )))

(defn re-sample
  "Do resampling. Currently the amplitude is stored by short such that maximum bitsPerSample is 16 (bytePerSample is 2)

  source-data - The source data in bytes - `byte[]`
  bits-per-sample - How many bits represents one sample (currently supports max. bitsPerSample=16) - `int`
  source-rate - Sample rate of the source data - `int`
  target-rate - Sample rate of the target data - `int`

  returns: re-sampled data - `byte[]`"
  ([^Resampler this source-data ^Integer bits-per-sample ^Integer source-rate ^Integer target-rate]
    (-> this (.reSample source-data bits-per-sample source-rate target-rate))))

