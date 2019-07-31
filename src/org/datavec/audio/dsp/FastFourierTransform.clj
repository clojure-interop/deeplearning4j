(ns org.datavec.audio.dsp.FastFourierTransform
  "FFT object, transform amplitudes to frequency intensities"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.dsp FastFourierTransform]))

(defn ->fast-fourier-transform
  "Constructor."
  (^FastFourierTransform []
    (new FastFourierTransform )))

(defn get-magnitudes
  "Get the frequency intensities

  amplitudes - amplitudes of the signal. Format depends on value of complex - `double[]`
  complex - if true, amplitudes is assumed to be complex interlaced (re = even, im = odd), if false amplitudesare assumed to be real valued. - `boolean`

  returns: intensities of each frequency unit: mag[frequency_unit]=intensity - `double[]`"
  ([^FastFourierTransform this amplitudes ^Boolean complex]
    (-> this (.getMagnitudes amplitudes complex)))
  ([^FastFourierTransform this amplitudes]
    (-> this (.getMagnitudes amplitudes))))

