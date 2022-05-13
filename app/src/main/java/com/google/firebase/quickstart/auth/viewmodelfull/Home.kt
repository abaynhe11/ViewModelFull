package com.google.firebase.quickstart.auth.viewmodelfull

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.quickstart.auth.viewmodelfull.databinding.FragmentHomeBinding


class Home : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        binding.first.text = viewModel.getFirstName().toString()
        binding.last.text = viewModel.getLastName().toString()

        binding.post.setOnClickListener {
            if (binding.firstName.text.isNotEmpty()) {
                viewModel.setFirstName(binding.firstName.text.toString())
                binding.first.text = viewModel.getFirstName().toString()
                binding.firstName.isVisible = false
            } else {
                binding.first.text = "No First Name"
            }
            if (binding.lastName.text.isNotEmpty()) {
                viewModel.setLastName(binding.lastName.text.toString())
                binding.last.text = viewModel.getLastName().toString()
                binding.lastName.isVisible = false
            } else {
                binding.last.text = "No Last Name"
            }

        }

            return binding.root

        }
    }
