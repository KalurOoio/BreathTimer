package com.savk.breathtimer.breathSession.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.savk.breathtimer.R
import com.savk.breathtimer.breathSession.SessionParameters
import com.savk.breathtimer.breathSession.viewModel.BreathViewModel

class BreathFragment: Fragment() {
    private val viewModel:BreathViewModel = BreathViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_breath_session,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.listener = this

        val inhaleValue = view.findViewById<TextView>(R.id.textView5)
        val pauseValue = view.findViewById<TextView>(R.id.textView9)
        val exhaleValue = view.findViewById<TextView>(R.id.textView7)
        val pause2Value = view.findViewById<TextView>(R.id.textView8)

        inhaleValue.text = viewModel.parameters.inhale.toString()
        inhaleValue.text = viewModel.parameters.exhale.toString()
        inhaleValue.text = viewModel.parameters.inhale.toString()
        inhaleValue.text = viewModel.parameters.sessionDelay1.toString()
    }

    fun onChange(newValues: SessionParameters) {
        val inhaleValue = view?.findViewById<TextView>(R.id.textView5)
        val pauseValue = view?.findViewById<TextView>(R.id.textView9)
        val exhaleValue = view?.findViewById<TextView>(R.id.textView7)
        val pause2Value = view?.findViewById<TextView>(R.id.textView8)

        inhaleValue?.text = newValues.inhale.toString()
        pauseValue?.text = newValues.exhale.toString()
        exhaleValue?.text = newValues.inhale.toString()
        pause2Value?.text = newValues.sessionDelay1.toString()
    }
}