package com.example.snakegame_app.ui.startgame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.example.snakegame_app.R
import com.example.snakegame_app.databinding.FragmentStartGameBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class StartGameFragment : Fragment() {

    private var _binding: FragmentStartGameBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStartGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI(){
        setupAnimations()

    }


    private fun setupAnimations(){
        with(binding){
            val animationBlinkFadeOut = AnimationUtils.loadAnimation(requireContext(), R.anim.blink_fade_out)
            val animationBlinkFadeIn = AnimationUtils.loadAnimation(requireContext(), R.anim.blink_fade_in)
            val animationTranslate1 = AnimationUtils.loadAnimation(requireContext(), R.anim.translate_snake_1)
            val animationTranslate2 = AnimationUtils.loadAnimation(requireContext(), R.anim.translate_sanke_2)
            imageApple1.startAnimation(animationBlinkFadeOut)
            imageApple2.startAnimation(animationBlinkFadeIn)
            imageSnake1.startAnimation(animationTranslate1)
            imageSnake2.startAnimation(animationTranslate2)
        }
    }

}