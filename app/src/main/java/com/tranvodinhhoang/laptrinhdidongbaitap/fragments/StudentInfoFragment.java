package com.tranvodinhhoang.laptrinhdidongbaitap.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tranvodinhhoang.laptrinhdidongbaitap.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StudentInfoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StudentInfoFragment extends Fragment {

    private String studentName;
    private String studentId;
    private String studentClass; // Add studentClass
    private String studentMajor; // Add studentMajor

    public StudentInfoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param studentName The name of the student.
     * @param studentId The ID of the student.
     * @param studentClass The class of the student.
     * @param studentMajor The major of the student.
     * @return A new instance of fragment StudentInfoFragment.
     */
    public static StudentInfoFragment newInstance(String studentName, String studentId, String studentClass, String studentMajor) {
        StudentInfoFragment fragment = new StudentInfoFragment();
        Bundle args = new Bundle();
        args.putString("studentName", studentName);
        args.putString("studentId", studentId);
        args.putString("studentClass", studentClass);
        args.putString("studentMajor", studentMajor);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            studentName = getArguments().getString("studentName");
            studentId = getArguments().getString("studentId");
            studentClass = getArguments().getString("studentClass");
            studentMajor = getArguments().getString("studentMajor");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_info, container, false);
        TextView nameTextView = view.findViewById(R.id.student_name);
        TextView idTextView = view.findViewById(R.id.student_id);
        TextView classTextView = view.findViewById(R.id.student_class);
        TextView majorTextView = view.findViewById(R.id.student_major);

        nameTextView.setText("Tên: " + studentName);
        idTextView.setText("MSSV: " + studentId);
        classTextView.setText("Lớp: " + studentClass);
        majorTextView.setText("Chuyên ngành: " + studentMajor);
        return view;
    }
}
