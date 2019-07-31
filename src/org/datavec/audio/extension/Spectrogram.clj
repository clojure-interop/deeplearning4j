(ns org.datavec.audio.extension.Spectrogram
  "Handles the wave data in frequency-time domain."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.extension Spectrogram]))

(defn ->spectrogram
  "Constructor.

  Constructor

  wave - `org.datavec.audio.Wave`
  fft-sample-size - number of sample in fft, the value needed to be a number to power of 2 - `int`
  overlap-factor - 1/overlapFactor overlapping, e.g. 1/4=25% overlapping, 0 for no overlapping - `int`"
  (^Spectrogram [^org.datavec.audio.Wave wave ^Integer fft-sample-size ^Integer overlap-factor]
    (new Spectrogram wave fft-sample-size overlap-factor))
  (^Spectrogram [^org.datavec.audio.Wave wave]
    (new Spectrogram wave)))

(def *-spectrogram-default-fft-sample-size
  "Static Constant.

  type: int"
  Spectrogram/SPECTROGRAM_DEFAULT_FFT_SAMPLE_SIZE)

(def *-spectrogram-default-overlap-factor
  "Static Constant.

  type: int"
  Spectrogram/SPECTROGRAM_DEFAULT_OVERLAP_FACTOR)

(defn get-normalized-spectrogram-data
  "Get spectrogram: spectrogram[time][frequency]=intensity

  returns: logarithm normalized spectrogram - `double[][]`"
  ([^Spectrogram this]
    (-> this (.getNormalizedSpectrogramData))))

(defn get-absolute-spectrogram-data
  "Get spectrogram: spectrogram[time][frequency]=intensity

  returns: absolute spectrogram - `double[][]`"
  ([^Spectrogram this]
    (-> this (.getAbsoluteSpectrogramData))))

(defn get-num-frames
  "returns: `int`"
  (^Integer [^Spectrogram this]
    (-> this (.getNumFrames))))

(defn get-frames-per-second
  "returns: `int`"
  (^Integer [^Spectrogram this]
    (-> this (.getFramesPerSecond))))

(defn get-num-frequency-unit
  "returns: `int`"
  (^Integer [^Spectrogram this]
    (-> this (.getNumFrequencyUnit))))

(defn get-unit-frequency
  "returns: `double`"
  (^Double [^Spectrogram this]
    (-> this (.getUnitFrequency))))

(defn get-fft-sample-size
  "returns: `int`"
  (^Integer [^Spectrogram this]
    (-> this (.getFftSampleSize))))

(defn get-overlap-factor
  "returns: `int`"
  (^Integer [^Spectrogram this]
    (-> this (.getOverlapFactor))))

