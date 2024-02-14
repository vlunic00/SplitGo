package com.example.splitgo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.compose.ui.text.capitalize
import androidx.navigation.fragment.findNavController
import com.example.splitgo.databinding.FragmentFirstBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase
import java.util.Locale

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private lateinit var database : DatabaseReference

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        readData()
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun readData(){
        database = FirebaseDatabase.getInstance().getReference("tickets")
        database.child("1").get().addOnSuccessListener {
            if (it.exists()){
                val id = it.child("id").value
                val status = it.child("status").value
                binding.ticketId.text = "Karta " + id.toString()
                binding.ticketStatus.text = status.toString()
                    .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
            }
            else{
                Toast.makeText(context, "Ticket doesn't exist",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener{
            Toast.makeText(context, "Failed to fetch",Toast.LENGTH_SHORT).show()
        }
    }
}