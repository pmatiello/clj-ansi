(ns clj-ansi.sgr)

(def ^:private csi "\u001B[")

(defn ^:private ansi-seq [code]
  (str csi code))

(def reset (ansi-seq "0m"))
(def bold (ansi-seq "1m"))
(def faint (ansi-seq "2m"))
(def italic (ansi-seq "3m"))
(def underline (ansi-seq "4m"))
(def slow-blink (ansi-seq "5m"))
(def fast-blink (ansi-seq "6m"))
(def reverse-video (ansi-seq "7m"))
(def conceal (ansi-seq "8m"))
(def strike (ansi-seq "9m"))
(def weight-off (ansi-seq "22m"))
(def italic-off (ansi-seq "23m"))
(def underline-off (ansi-seq "24m"))
(def blink-off (ansi-seq "25m"))
(def reverse-video-off (ansi-seq "27m"))
(def conceal-off (ansi-seq "28m"))
(def strike-off (ansi-seq "29m"))